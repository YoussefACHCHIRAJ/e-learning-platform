import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { token } from '../../utils/functions';

export const unAuthenticatedGuard: CanActivateFn = (route, state) => {
  const router: Router = inject(Router);
  const isAuthenticated: boolean = !token();
  return isAuthenticated || router.navigate(['/dashboard']);
};

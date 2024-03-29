import { CanActivateFn, Router } from '@angular/router';
import { token } from '../../utils/functions';
import { inject } from '@angular/core';

export const authenticatedGuard: CanActivateFn = (route, state) => {
  const router: Router = inject(Router);
  const isAuthenticated: boolean = !!token()
  return isAuthenticated || router.navigate(['/auth']);
};

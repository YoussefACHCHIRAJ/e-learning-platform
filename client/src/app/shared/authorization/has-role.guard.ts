import { CanActivateFn, Router } from '@angular/router';
import { Roles } from './roles';
import { inject } from '@angular/core';
import { auth } from '../../utils/functions';

export const hasRoleGuard: CanActivateFn = (route, state) => {
  const router: Router = inject(Router);
  const userRole: string = auth()?.user?.role!;
  const expectedRoles: Roles[] = route.data['roles'];

  const hasRole: boolean = expectedRoles.some((role) => userRole === role);
  
  return hasRole || router.navigate(['/dashboard']);
};

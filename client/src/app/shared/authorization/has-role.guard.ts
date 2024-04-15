import { CanActivateFn, Router } from '@angular/router';
import { Roles } from './roles';
import { inject } from '@angular/core';
import { JwtService } from '../service/jwt.service';

export const hasRoleGuard: CanActivateFn = (route, state) => {
  const router: Router = inject(Router);
  const jwtService: JwtService = inject(JwtService);
  const userRole: string = jwtService.extractRole()!;
  const expectedRoles: Roles[] = route.data['roles'];

  const hasRole: boolean = expectedRoles.some((role) => userRole === role);
  
  return hasRole || router.navigate(['/dashboard']);
};

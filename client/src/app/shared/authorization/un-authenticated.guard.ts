import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { JwtService } from '../service/jwt.service';

export const unAuthenticatedGuard: CanActivateFn = (route, state) => {
  const router: Router = inject(Router);
  const jwtService: JwtService = inject(JwtService);
  const isAuthenticated: boolean = !jwtService.getToken();
  return isAuthenticated || router.navigate(['/dashboard']);
};

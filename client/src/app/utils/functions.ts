import { Roles } from '../shared/authorization/roles';
import { AuthType } from '../types';

export const auth = (): AuthType => {
  return JSON.parse(localStorage.getItem('auth')!);
};

export const token = () => {
  return auth()?.token;
};

export const isAdmin = () => {
  return auth()?.user.role === Roles.ADMIN;
};

export const isProf = () => {
  return auth()?.user.role === Roles.PROF;
};

export const isStudent = () => {
  return auth()?.user.role === Roles.STUDENT;
};

export const getAvatar = () => {
  const email = auth().user.email;
  const firstCharacter = email[0];
  const integerToUse: number = isNumeric(firstCharacter)
    ? firstCharacter.toLowerCase().charCodeAt(0) - 21
    : firstCharacter.toLowerCase().charCodeAt(0) - 96;

  return `https://www.gravatar.com/avatar/${email}?s=200&d=https://s3.amazonaws.com/laracasts/images/forum/avatars/default-avatar-${integerToUse}.png`;
};

const isNumeric = (character: string): boolean => {
  return /^\d+$/.test(character);
};

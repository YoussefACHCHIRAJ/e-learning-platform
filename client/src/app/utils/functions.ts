export const getAvatar = (email: string = 'a') => {
  const firstCharacter = email[0];
  const integerToUse: number = isNumeric(firstCharacter)
    ? firstCharacter.toLowerCase().charCodeAt(0) - 21
    : firstCharacter.toLowerCase().charCodeAt(0) - 96;

  return `https://www.gravatar.com/avatar/${email}?s=200&d=https://s3.amazonaws.com/laracasts/images/forum/avatars/default-avatar-${integerToUse}.png`;
};

const isNumeric = (character: string): boolean => {
  return /^\d+$/.test(character);
};

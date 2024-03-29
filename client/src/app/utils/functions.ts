import { Roles } from "../shared/authorization/roles";
import { AuthType } from "../types";

export const auth = () : AuthType => {
    return JSON.parse(localStorage.getItem("auth")!);
}

export const token = () => {
    return auth()?.token;
}

export const isAdmin = () => {
    return auth()?.user.role === Roles.ADMIN
}

export const isProf = () => {
    return auth()?.user.role === Roles.PROF
}

export const isStudent = () => {
    return auth()?.user.role === Roles.STUDENT
}
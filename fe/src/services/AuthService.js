import { httpRequestJson } from "./common";

export function login(credentials) {
  return httpRequestJson("POST", "auth/login", credentials);
}

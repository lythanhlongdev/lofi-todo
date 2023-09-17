const apiUrl = "http://localhost:8080/api";

async function httpRequestJson(method, uri, body) {
  let options = {
    method: method,
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
    body: body && JSON.stringify(body),
  };
  const res = await fetch(`${apiUrl}/${uri}`, options);
  const data = await res.json();
  return data;
}

export { httpRequestJson };

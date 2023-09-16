import logo from "./logo.svg";
import "./App.css";

import Home from "./page/Home";
import { LofiProvider } from "./context/Lofi.context";

function App() {
  return (
    <LofiProvider>
      <Home />
    </LofiProvider>
  );
}

export default App;

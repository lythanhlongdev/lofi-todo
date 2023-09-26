import React, { useState, useEffect, createContext } from "react";

export const LofiContext = createContext();

export const LofiProvider = ({ children }) => {
  const [openPopup, setOpenPopup] = useState(false);
  const [popup, setPopup] = useState(0);

  const popupHandler = (type) => {
    setPopup(type);
    if (type === popup && openPopup) {
      setOpenPopup(false);
    } else setOpenPopup(true);
  };

  const sceneChangeHandler = (scene) => {
    // Lấy phần tử DOM của trang chủ.
    const homeElement = document.querySelector("#home");
    console.log(homeElement);

    // Thiết lập nền bằng JavaScript.
    homeElement.style.background = scene;
  };

  return (
    <LofiContext.Provider
      value={{ openPopup, popupHandler, popup, sceneChangeHandler }}
    >
      {children}
    </LofiContext.Provider>
  );
};

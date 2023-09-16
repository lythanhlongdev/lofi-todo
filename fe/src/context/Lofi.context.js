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

  return (
    <LofiContext.Provider value={{ openPopup, popupHandler, popup }}>
      {children}
    </LofiContext.Provider>
  );
};

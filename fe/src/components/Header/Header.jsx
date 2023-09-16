import React, { useContext } from 'react'

import Navbar from '../Navbar/Navbar'
import PopupFeature from '../PopupFeature/PopupFeature'

import classes from '../../assets/css/Header.module.css'

import { LofiContext } from '../../context/Lofi.context'

const Header = () => {
    const lofiCtx = useContext(LofiContext)

    return (
        <div className={classes.header}>
            <Navbar />
            {lofiCtx.openPopup && <PopupFeature />}
        </div>
    )
}

export default Header
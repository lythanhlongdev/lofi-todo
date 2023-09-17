import React, { memo, useState, useContext } from 'react'

import classes from '../../assets/css/PopupFeature.module.css'

import { LofiContext } from '../../context/Lofi.context'
import PopupLogin from './PopupLogin'
import PopupLogout from './PopupLogout'
import PopupRegister from './PopupRegister'
import ModalScene from '../ModalScene/ModalScene'
import ModalNote from '../ModalNote/ModalNote'
import ModalTodo from '../ModalTodo/ModalTodo'
import ModalTime from '../ModalTime/ModalTime'

const PopupFeature = memo(() => {
    const lofiCtx = useContext(LofiContext)
    const [openForm, setOpenForm] = useState(true)

    const user = localStorage.getItem("userLofiTodo")

    return (
        < div className={`${lofiCtx.openPopup ? classes.popup : classes.hidden}`}>
            {lofiCtx.popup === 1 && <ModalScene />}
            {lofiCtx.popup === 2 && <ModalTodo />}
            {lofiCtx.popup === 3 && <ModalNote />}
            {lofiCtx.popup === 4 && <ModalTime />}
            {
                lofiCtx.popup === 5 && !user &&
                <div className={classes.form}>
                    <div className={classes['head-form']}>
                        <div
                            onClick={() => setOpenForm(true)}
                            className={`${classes['btn-left']} ${openForm ? classes.active : ""}`}
                        >
                            Login
                        </div>
                        <div className={`${classes['line-stand']} ${openForm ? classes.left : classes.right}`}>
                            <div></div>
                        </div>
                        <div
                            onClick={() => setOpenForm(false)}
                            className={`${classes['btn-right']} ${openForm ? "" : classes.active}`}
                        >
                            Register
                        </div>
                    </div>
                    <div className={classes['body-form']}>
                        {openForm ? <PopupLogin /> : <PopupRegister />}
                    </div>
                </div>
            }
            {lofiCtx.popup === 5 && user && <PopupLogout />}


        </div >
    )
})

export default PopupFeature
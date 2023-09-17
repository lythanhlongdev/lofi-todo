import React, { memo, useState, useContext } from 'react'

import classes from '../../assets/css/PopupFeature.module.css'

import { LofiContext } from '../../context/Lofi.context'
import PopupLogin from './PopupLogin'
import PopupLogout from './PopupLogout'
import PopupRegister from './PopupRegister'

const PopupFeature = memo(() => {
    const lofiCtx = useContext(LofiContext)
    const [openForm, setOpenForm] = useState(true)

    const user = localStorage.getItem("userLofiTodo")
    // const user = "not"

    return (
        <div className={classes.popup}>
            {lofiCtx.popup === 5 && !user ?
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
                : <PopupLogout />
            }
        </div>
    )
})

export default PopupFeature
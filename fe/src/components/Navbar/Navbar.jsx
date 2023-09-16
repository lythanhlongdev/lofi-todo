import React, { useContext } from 'react'
import { UserOutlined, PictureOutlined, FormOutlined, FieldTimeOutlined, ProjectOutlined } from '@ant-design/icons'
import classes from '../../assets/css/Navbar.module.css'
import { LofiContext } from '../../context/Lofi.context'

const Navbar = () => {
    const lofiCtx = useContext(LofiContext)

    return (
        <div className={classes.navbar}>
            <div className={`${classes.image} ${classes["navbar-item"]}`}>
                <PictureOutlined
                    className={classes.icon}
                    onClick={() => {
                        lofiCtx.popupHandler(1);
                    }}
                />
            </div>
            <div className={`${classes.todo} ${classes["navbar-item"]}`}>
                <ProjectOutlined
                    className={classes.icon}
                    onClick={() => {
                        lofiCtx.popupHandler(2);
                    }}
                />
            </div>
            <div className={`${classes.note} ${classes["navbar-item"]}`}>
                <FormOutlined
                    className={classes.icon}
                    onClick={() => {
                        lofiCtx.popupHandler(3);
                    }}
                />
            </div>
            <div className={`${classes.time} ${classes["navbar-item"]}`}>
                <FieldTimeOutlined
                    className={classes.icon}
                    onClick={() => {
                        lofiCtx.popupHandler(4);
                    }}
                />
            </div>
            <div className={`${classes.user} ${classes["navbar-item"]}`}>
                <UserOutlined
                    className={classes.icon}
                    onClick={() => {
                        lofiCtx.popupHandler(5);
                    }}
                />
            </div>
        </div>
    )
}

export default Navbar
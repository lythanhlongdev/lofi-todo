import React from 'react'

import classes from '../../assets/css/PopupLogin.module.css'

const PopupLogin = () => {
    return (
        <div className={classes.login}>
            <div className={classes['login_header']}>
                <h1>Meo - Lofi</h1>
            </div>
            <div className={classes['login_username']}>
                <label for="username">Username (*)</label>
                <input type="text" id='username' />
            </div>
            <div className={classes['login_password']}>
                <label for="password">Password (*)</label>
                <input type="password" id='password' />
            </div>
            <div className={classes['login_captcha']}>
                <input type="text" id='captcha' />
                <label for="captcha">captcha</label>
            </div>
            <div className={classes['login_btn']}>
                <button>Login</button>
            </div>
            <div className={classes['login_forgot']}>
                <p>Forgot password ?</p>
            </div>
        </div>
    )
}

export default PopupLogin
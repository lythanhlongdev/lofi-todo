import React, { useState } from 'react'
import login from '../../services/AuthService'
import classes from '../../assets/css/PopupLogin.module.css'

const PopupLogin = () => {
    const [userInput, setUserInput] = useState({
        username: "",
        password: "",
        captcha: ""
    });

    const inputChangeHandler = (event) => {
        setUserInput((prevState) => {
            return {
                ...prevState,
                [event.target.name]: event.target.value,
            };
        });
    };

    const onSubmitHandler = () => {
        // login(userInput).then((res) => { console.log(res) })
        console.log(userInput);
    }

    return (
        <div className={classes.login}>
            <div className={classes['login_header']}>
                <h1>Meo - Lofi</h1>
            </div>
            <div className={classes['login_username']}>
                <label for="username">Username (*)</label>
                <input
                    type="text"
                    id='username'
                    name="username"
                    onChange={inputChangeHandler}
                />
            </div>
            <div className={classes['login_password']}>
                <label for="password">Password (*)</label>
                <input
                    type="password"
                    id='password'
                    name="password"
                    onChange={inputChangeHandler}
                />
            </div>
            <div className={classes['login_captcha']}>
                <input
                    type="text"
                    id='captcha'
                    name="captcha"
                    onChange={inputChangeHandler}
                />
                <label for="captcha">captcha</label>
            </div>
            <div className={classes['login_btn']}>
                <button onClick={onSubmitHandler}>Login</button>
            </div>
            <div className={classes['login_forgot']}>
                <p>Forgot password ?</p>
            </div>
        </div>
    )
}

export default PopupLogin
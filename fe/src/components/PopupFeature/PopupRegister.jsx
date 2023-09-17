import React, { useState } from 'react'
import classes from '../../assets/css/PopupRegister.module.css'


const PopupRegister = () => {
    const [userInput, setUserInput] = useState({
        username: "",
        email: "",
        password: "",
        confirmPassword: "",
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
        // register(userInput).then((res) => { console.log(res) })
        console.log(userInput);
    }

    return (
        <div className={classes.register}>
            <div className={classes['register_header']}>
                <h1>Meo - Lofi</h1>
            </div>
            <div className={classes['register_username']}>
                <label for="username">Username (*)</label>
                <input
                    type="text"
                    id='username'
                    name="username"
                    onChange={inputChangeHandler}
                />
            </div>
            <div className={classes['register_email']}>
                <label for="email">Email (*)</label>
                <input
                    type="text"
                    id='email'
                    name="email"
                    onChange={inputChangeHandler}
                />
            </div>
            <div className={classes['register_password']}>
                <label for="password">Password (*)</label>
                <input
                    type="password"
                    id='password'
                    name="password"
                    onChange={inputChangeHandler}
                />
            </div>
            <div className={classes['register_confirmPassword']}>
                <label for="confirmPassword">Confirm Password (*)</label>
                <input
                    type="text"
                    id='confirmPassword'
                    name="confirmPassword"
                    onChange={inputChangeHandler}
                />
            </div>
            <div className={classes['register_captcha']}>
                <input
                    type="text"
                    id='captcha'
                    name="captcha"
                    onChange={inputChangeHandler}
                />
                <label for="captcha">captcha</label>
            </div>
            <div className={classes['register_btn']}>
                <button onClick={onSubmitHandler}>register</button>
            </div>
            <div className={classes['register_redirect']}>
                <p>Have a account ?</p>
            </div>
        </div>
    )
}

export default PopupRegister
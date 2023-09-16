import React from 'react'

import Header from '../components/Header/Header'
import Footer from '../components/Footer/Footer'

import classes from '../assets/css/Home.module.css'

const Home = () => {
    return (
        <div className={classes.home}>
            <Header />
            <Footer />
        </div>
    )
}

export default Home
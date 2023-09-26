import React, { useContext } from 'react'
import classes from '../../assets/css/ModalScene.module.css'

import { LofiContext } from '../../context/Lofi.context'

const ModalScene = () => {
    const lofiCtx = useContext(LofiContext)

    const thumbnailClickHandler = (scene) => {
        lofiCtx.sceneChangeHandler(scene);
    };

    return (
        <div className={classes['scene-modal']}>
            <div className={classes['scene-modal__header']}>
                <p className={classes['scene-modal__tittle']}>SCENES</p>
            </div>
            <div className={classes['scene-modal__thumbnail-container']}>
                <div
                    className={`${classes['scene-modal__thumbnail']} ${classes['scene-1']}`}
                    onClick={() => thumbnailClickHandler('red url(http://localhost:3000/static/media/Background_1.6b72399bd8bd0799dd3a.png) no-repeat top center')}
                ></div>
                <div
                    className={`${classes['scene-modal__thumbnail']} ${classes['scene-2']}`}
                    onClick={() => thumbnailClickHandler('blue url(http://localhost:3000/static/media/Backgound_2.2f200766a798d154c178.png) no-repeat top center')}
                ></div>
            </div>
        </div>
    )
}

export default ModalScene
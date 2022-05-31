import React, { useState, useEffect } from 'react'
import '../IfoodCounter/IfoodCounter.css'

export default function IfoodCounter() {
    const [value, setValue] = useState(1);
    const [buttonStyle, setButtonStyle] = useState('counter-button-minus-active')

    useEffect(() => {
        document.getElementById('moeda').innerHTML = 2 * value
    }, [value])

    useEffect(() => {
        console.log(`Estilo atual do botão ${buttonStyle}`)
    }, [buttonStyle])

    function increment(){
        setButtonStyle('counter-button-minus-active')
        setValue(value+1)
    }

    function decrement(){
        if (value <= 1){
            setButtonStyle('counter-button-minus-desactive')
        }

        if(value > 0)
            setValue(value-1)
    }

    return (
        <div className='counter-wrapper'>
            <button
                className={buttonStyle}
                onClick={decrement}
            >-</button>
            <p>{value}</p>
            <button
                className='counter-button-plus-active'
                onClick={increment}
            >+</button>
            <button id='moeda'>12,00</button>
        </div>
    )
}

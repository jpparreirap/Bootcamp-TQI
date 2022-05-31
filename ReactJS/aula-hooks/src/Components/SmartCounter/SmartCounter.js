import { useState } from 'react';

function SmartCounter() {
    const [quantity, setQuantity] = useState(1)

    return(
        <>
            <h1>{quantity}</h1>
            <button onClick={() => setQuantity(quantity + 1)}>Incrementar</button>
        </>
    )
}

export default SmartCounter;
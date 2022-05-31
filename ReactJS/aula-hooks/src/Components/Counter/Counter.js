function Counter() {
    let quantity = 1;

    const increment = () => {
        quantity += 1;
        document.getElementById('counter-box').innerHTML = quantity
        console.log(quantity);
    }

    return(
        <>
            <h1 id="counter-box">{quantity}</h1>
            <button onClick={increment}>Incrementar</button>
        </>
    )
}

export default Counter;
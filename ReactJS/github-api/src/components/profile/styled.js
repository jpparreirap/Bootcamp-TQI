import styled from 'styled-components';

export const Wrapper = styled.div`
    display: flex;
    align-items: flex-start;
    padding-left: 1vw;
    padding-top: 0.8519vh;
`;

export const WrapperInfoUser = styled.div`
    display: flex;
    align-items: flex-start;
    flex-direction: column;
    justify-content: space-between;
    height: 21.3vh;
    margin-left: 0.5vw;
    padding-left: 7.45vw;
    h1{
        font-size: 2rem;
        font-weight: bold;
    }
    h3{
        font-size: 1.1rem;
        font-weight: bold;
    }
    h4{
        font-size: 1rem;
        font-weight: bold;
    }
`;

export const WrapperStatusCount = styled.div`
    display: flex;
    align-items: center;
    div{
        margin-right: 0.5vw;
        text-align: center;
    }
`;

export const WrapperUserGeneric = styled.div`
    display: flex;
    align-items: center;
    margin-top: 0.8519vh;
    h3{
        margin-right: 0.5vw;
    }
    a{
        color: blue;
        font-weight: bold;
        font-size: 1.1rem;
    }
`;

export const WrapperImage = styled.img`
    border-radius: 50%;
    width: 21.3vh;
    margin: 0.8519vh 0.5vw;
    margin-top: 0.8519vh;
`;
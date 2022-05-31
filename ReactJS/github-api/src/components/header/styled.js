import styled from 'styled-components';

export const Wrapper = styled.div`
    display: flex;
    width: 100%;
    justify-content: space-between;
    padding: 0.425985vh 0.25vw;

    input{
        border: 0.0625rem solid #CCCCCC;
        border-radius: 0.5rem;
        width: 100%;
        height: 4.6858vh;
        padding: 0.8519vh 0.5vw;
        font-weight: 500;
    }

    button{
        background-color: #225ed8;
        padding: 0.8519vh 1vw;
        margin: 0 1vw;
        border-radius: 0.5rem;

        &:hover{
            background-color: #2c5282;
            box-shadow: 0.1875rem 0.125rem 0.625rem rgba(0,0,0,0.5);
        }

        span{
            font-weight: bold;
            font-size: 1rem;
            color: #FFFFFF;
        }
    }
`;

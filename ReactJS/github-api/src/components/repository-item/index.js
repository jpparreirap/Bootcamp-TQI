import React from 'react'
import { Wrapper, WrapperFullName, WrapperLink, WrapperTitle } from './styled';

function RepositoryItem({ name, linkToRepo, fullName }) {
  return (
    <Wrapper>
        <WrapperTitle>{name}</WrapperTitle>
        <WrapperFullName>Full name: </WrapperFullName>
        <WrapperLink href={linkToRepo} target='_blank' rel='noreferrer'>{fullName}</WrapperLink>
    </Wrapper>
  )
}

export default RepositoryItem;
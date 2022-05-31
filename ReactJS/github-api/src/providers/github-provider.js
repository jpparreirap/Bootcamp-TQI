import React, { createContext, useCallback, useState } from 'react'
import api from '../services/api';

export const GithubContext = createContext({
    loading: false,
    user: {

    },
    repositories: [],
    starred: [],
})

function GithubProvider({children}) {
    const [githubState, setGithubState] = useState({
        hasUser: false,
        loading: false,
        user: {
            id: undefined,
            avatar_url: undefined,
            login: undefined,
            name: undefined,
            html_url: undefined,
            blog: undefined,
            company: undefined,
            location: undefined,
            followers: 0,
            following: 0,
            public_gists: 0,
            public_repos: 0,
        },
        repositories: [],
        starred: [],
    });

    const getUser = (userName) => {

        setGithubState(prevState => ( {
            ...prevState, 
            loading: !prevState.loading
        } ))

        api.get(`users/${userName}`)
        .then(({data}) => {
            // console.log('data: ' + JSON.stringify(data))
            setGithubState(prevState => ( {
                ...prevState, 
                hasUser: true,
                user: {
                    id: data.id,
                    avatar_url: data.avatar_url,
                    login: data.login,
                    name: data.name,
                    html_url: data.html_url,
                    blog: data.blog,
                    company: data.company,
                    location: data.location,
                    followers: data.followers,
                    following: data.following,
                    public_gists: data.public_gists,
                    public_repos: data.public_repos,
                },
            } ))
        })
        .finally(() => {
            setGithubState(prevState => ( {
                ...prevState, 
                loading: !prevState.loading
            } ))
        })
    }

    const getUserRepos = (userName) => {
        api.get(`users/${userName}/repos`)
        .then(({data}) => {
            // console.log('data: ' + JSON.stringify(data))
            setGithubState(prevState => ( {
                ...prevState, 
                repositories: data,
            } ))
        })
    }

    const getUserStarred = (userName) => {
        api.get(`users/${userName}/starred`)
        .then(({data}) => {
            console.log('data: ' + JSON.stringify(data))
            setGithubState(prevState => ( {
                ...prevState, 
                starred: data,
            } ))
        })
    }

    const contextValue = {
        githubState,
        getUser: useCallback((userName) => getUser(userName), []),
        // eslint-disable-next-line react-hooks/exhaustive-deps
        getUserRepos: useCallback((userName) => getUserRepos(userName), []),
        // eslint-disable-next-line react-hooks/exhaustive-deps
        getUserStarred: useCallback((userName) => getUserStarred(userName), []),
    };

    return (
    <GithubContext.Provider value = {contextValue}>{children}</GithubContext.Provider>
  );
};

export default GithubProvider;
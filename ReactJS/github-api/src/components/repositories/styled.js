import styled from 'styled-components';
import { Tabs, TabList, Tab, TabPanel } from 'react-tabs';

export const WrapperTabs = styled(Tabs)`
    font-size: 1rem;
    width: 100%;
    margin-top: 1.7vh;
`;

export const WrapperTabList = styled(TabList)`
    list-style-type: none;
    padding: 0.42598vh 0.25vw;
    padding-bottom: 1.7vh;
    display: flex;
    margin: 0;
`;

WrapperTabList.tabsRole = 'TabList';

export const WrapperTab = styled(Tab)`
    border-radius: 1rem;
    border: 0.0625rem solid #CCCCCC;
    padding: 1.7vh 1vw;
    user-select: none;
    cursor: pointer;
    z-index: 999999;
    background-color: #FFFFFF;
    margin: 0.8519vh 0.5vw;
    /* box-shadow: 0 0 1em #CCCCCC; */

    &:focus{
        outline: none;
    }

    &.is-selected {
        box-shadow: 0.1875rem 0.125rem 0.625rem rgba(0,0,0,0.5);
    }
`;

WrapperTab.tabsRole = 'Tab';

export const WrapperTabPanel = styled(TabPanel)`
    padding: 1.7vh 1vw;
    border: 0.0625rem solid #CCCCCC;
    display: none;
    margin-top: -0.53248vh;
    
    &.is-selected {
        display: block;
    }
`;

WrapperTabPanel.tabsRole = 'TabPanel';

export const WrapperList = styled.div`
    display: flex;
    justify-content: flex-start;
    flex-wrap: wrap;
`;
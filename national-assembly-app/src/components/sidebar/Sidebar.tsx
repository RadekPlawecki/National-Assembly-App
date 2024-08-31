import React from 'react';
import './Sidebar.css';
import { SidebarData } from './SidebarData';

function Sidebar() {
    return (
        <aside id="sidebar">
        <div className="sidebar-title">
            <div className="logo">
                <img src="/ESNstar_digital_full_colour_safezone.png" alt="Logo"/>
            </div>
        </div>
            <ul className="sidebar-list">
                {SidebarData.map((val, key) => {
                    return (<li key={key} className="row" id={window.location.pathname === val.link ? "active" : ""}
                                onClick={() => window.location.pathname = val.link}>
                            <div id="icon">
                                {val.icon}
                            </div>
                            {" "}
                            <div id="title">
                                {val.title}
                            </div>
                        </li>
                    );
                })}
            </ul>
            <div className="version">National Assembly App <br/> v1.0.0</div>
        </aside>
    );
}

export default Sidebar;

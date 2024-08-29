import React from 'react';
import './Sidebar.css';

const Sidebar: React.FC = () => {
    return (
        <div className="sidebar">
            <div className="logo">
                <img src="/ESNstar_digital_full_colour_safezone.png" alt="Logo" />
            </div>
            <nav className="menu">
                <ul>
                    <li>Dashboard</li>
                    <li>Speakers' List</li>
                    <li>Opportunities</li>
                    <li>Votings</li>
                    <li>Candidacies</li>
                </ul>
            </nav>
            <div className="version">National Assembly App <br /> v1.0.0</div>
        </div>
    );
};

export default Sidebar;

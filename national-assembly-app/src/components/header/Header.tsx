import React from "react";
import './Header.css';
import Button from "../button/Button";
import LogoutIcon from '@mui/icons-material/Logout';

const checkLink = (link: String): string => {
    const word = link.substring(1, 5).toLowerCase();
    const headers: { [key: string]: string } = {
        "dash": "Dashboard",
        "spea": "Speakers' list",
        "oppo": "Opportunities",
        "voti": "Voting"
    };
    return headers[word] || "Candidacies";
}

function Header() {
    return (
      <div className="header">
          <h1 className="header-left">{checkLink(window.location.pathname)}</h1>
          <div className="header-right">
              <Button id="profile" variant="profile" height="6vh" width="auto + 5px">
                  <div className="photo">
                      <img src="/ESNstar_digital_full_colour_safezone.png" alt="Logo"/>
                  </div>
                  Radosław
              </Button>
              <Button id="logout" variant="logout" height="6vh" width="4vw">
                  <LogoutIcon id="icon"/>
              </Button>
          </div>
      </div>
    );
}

export default Header;
import React, {ReactNode} from "react";
import {styled} from "styled-components";

interface ButtonProps {
    type?: "button" | "submit" | "reset";
    variant?: string;
    className?: string;
    id?: string;
    onClick?: () => void;
    children: ReactNode;
    height?: string;
    width?: string;
}

const ButtonComponent = styled.button<ButtonProps>`
    position: relative;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    text-align: center;
    text-decoration: none;
    vertical-align: middle;
    cursor: pointer;
    user-select: none;
    border-radius: 10px;
    padding: 0;
    font-family: LatoBold, serif;
    border: 1px solid #C5C5C5;
    background-color: ${
    props => props.variant === "view" ? "#00AEEF" :
            props.variant === "add" ? "#7AC143" : props.variant === "archive" ? "#EC008C" : props.variant === "logout" ? "#EC008C" : "#FFFFFF"};
    height: ${props => props.height};
    width: ${props => props.width};
`

const Button = ({type, className, variant, id, onClick, children, height, width}: ButtonProps) => {
    return (
        <ButtonComponent type={type ? type : "button"} className={className ? `btn-component ${className}` : "btn-component"}
                         variant={variant} id={id} onClick={onClick} height={height} width={width} >
        {children}
    </ButtonComponent>
    );
}

export default Button;
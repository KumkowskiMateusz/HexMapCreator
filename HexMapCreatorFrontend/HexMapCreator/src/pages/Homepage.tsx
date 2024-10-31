import React from "react"

function Homepage(){

    const [slide,setSlide] = React.useState(0)

    
        return(
        <>
            <div id="hexagon_border_glow" className="absolute">
                <div id="hexagon_border">
                        <div id="hexagon"></div> 
                </div>
            </div>
           
            <div id="selection_holder">
                <div id="login_form_holder">
                    <button id="switch_form_button">Switch Form</button>
                    <form id="login_form">
                        <label htmlFor="login_username">Username</label>
                        <input type="text" id="login_username" name="login_username"></input>
                        <br></br>
                        <label htmlFor="login_password">Password</label>
                        <input type="password" id="login_password"></input>
                        <br></br>
                        <input type="submit" id="login_submit" value="Login"></input>
                    </form>
                </div>
                <div id="signup_form_holder">
                    <form id="signup_form">
                        <label htmlFor="signup_username">Username</label>
                        <input type="text" id="signup_username" name="signup_username"></input>
                        <br></br>
                        <label htmlFor="signup_password">Password</label>
                        <input type="password" id="signup_password"></input>
                        <br></br>
                        <input type="submit" id="signup_submit" value="Sign up!"></input>
                    </form>
                </div>
            </div>
        </>
        )
    }
  
export default Homepage
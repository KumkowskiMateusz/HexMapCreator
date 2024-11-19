import React from "react"

function Homepage(){

    const [slide,setSlide] = React.useState(0)

    
        return(
        <>   
            <div id="hexagon_container">
                <div id="mid_hexagon">
                        <div id="hexagon_border">
                                <div id="hexagon" className="bg_lightshade"></div> 
                        </div>
                </div> 
            </div>

            <div id="selection_holder"> 
                <form id="login_form">
                    <label htmlFor="login_username">Username&#9;</label>
                    <input type="text" id="login_username" name="login_username"></input>
                    <br></br>
                    <label htmlFor="login_password">Password&#9;</label>
                    <input type="password" id="login_password"></input>
                    <br></br>
                    <input type="submit" id="login_submit" value="Login"></input>
                </form>
            </div>
        </>
        )
    }
  
export default Homepage
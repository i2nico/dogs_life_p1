import React from 'react'
import batman from '../images/batman.jpeg'
import images from '../index.js'

const HeroDetails = (props) => {
  return (
    <div>
        <img src={images[props.info.alias.replaceAll(/\s/g,'')]} alt={props.info.name} height="250px"/>  
    </div>
  )
}

export default HeroDetails;
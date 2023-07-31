import React from 'react'
import HeroDetails from './HeroDetails'

const hero = {
    "id":1,
    "name":"Bruce Wayne",
    "alias":"Batman",
    "superpower":"Martial Arts",
    "teamID":1
}

const AllHeroes = () => {
  return (
   <HeroDetails info = {hero}/>
  )
}

export default AllHeroes;

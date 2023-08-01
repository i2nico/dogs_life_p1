import Row from 'react-bootstrap/Row'
import React from 'react'
import HeroDetails from './HeroDetails'
import { useState, useEffect } from 'react'
import { getAllHeroes } from '../services/hero-service';



const AllHeroes = () => {

  const [total, setTotal] = useState(0);
  const [heroes, setHeroes] = useState([])

  const totalCountHandler = (name) =>{
    console.log(name)
    setTotal(total+1);
  }

  useEffect(() => {
    getHeroesFromAPI();
  }, []
  );
  const getHeroesFromAPI = () => {}

  getAllHeroes()
  .then(res => {
      setHeroes(res.data);
  })
  .catch(err => {
      setHeroes([]);
      console.log(err);
  })

  return (
    <>
      <h1> Total count is: {total}</h1>
      <Row xs="auto">
      {heroes.map(hero => (
        <div className='container' key={hero.id.toString()}>
          <HeroDetails info={hero} parentCount={totalCountHandler}/>
        </div>
       ))}
      </Row>
    </>
  )
}

export default AllHeroes;

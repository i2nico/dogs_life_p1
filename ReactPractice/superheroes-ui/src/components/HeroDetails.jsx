import React from 'react'
import images from '../index.js'
import Button from 'react-bootstrap/Button'
import Card from 'react-bootstrap/Card'
import { useState } from 'react'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'



const HeroDetails = (props) => {

  const[counter, setCounter] = useState(0);

  const incrementCounter = () =>{
        setCounter(counter + 1);
        props.parentCount(props.info.alias)
  }

  return (
    <Card style={{ width: "16rem" }}>
      <div className="imgContainer">
        <Card.Img variant="top" src={images[props.info.alias.replaceAll(/\s/g, '')]} width="150px" />
      </div>
    <Card.Body >
      <Card.Title >Alias: {props.info.alias}</Card.Title>
      <Card.Text >Name: {props.info.name}</Card.Text>
      <Row>
        <Col><Button variant="primary" onClick={incrementCounter}>Like</Button></Col>
        <Col>{counter > 0  && <Card.Text >Likes: {counter}</Card.Text > }</Col>
      </Row>
    </Card.Body>
  </Card>  
  )
}

export default HeroDetails;
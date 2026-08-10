import React from 'react'
import Video from './Video'
import Hometext from './Hometext'

const Home = () => {
  return (
    <div>
      <div className='h-screen w-screen fixed'>
        <Video/>
      </div>
      <div className='h-screen w-screen relative flex flex-col'>
        <Hometext/>
      </div>
    </div>
  )
}

export default Home

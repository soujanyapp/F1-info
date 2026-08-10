import React from "react";
import f1cinematics from "../../../src/assets/home/f1cinematics.mp4";

const Video = () => {
  return (
    <div className="h-full w-full">
      <video
        className="h-full w-full object-cover"
        autoPlay
        muted
        loop
        src={f1cinematics}
      ></video>
    </div>
  );
};

export default Video;

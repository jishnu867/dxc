import React, { Component } from 'react';


class Sample extends Component {
    constructor(props) {
        super(props)
        this.state=({
           
        })
    }

dateCalculation=(e)=> {
    
      var date1=new Date().getTime();
    var c=new Date("10/30/2019").getTime();
    var a=(c-date1)/(3600*1000*24);
      console.log(a);

}
    
    render() {
        return (
            <div>
              Press enter
              
               <button onClick={(e) => this.dateCalculation(e)}>Submit</button>
            </div>
        );
    }
}

export default Sample;
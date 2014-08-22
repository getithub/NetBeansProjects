/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function(){
    
    
   var el=document.getElementsByTagName("button");
   for(var i=0,len=el.length;i<len;i=i+1){
       el[i].onclick=function (){
         var className=this.innerHTML.toString()  ;
         document.body.className=className;
       };
   }
}());


   $(function() {
              $( "#txtfechan" ).datepicker();
            });
            
            $('.selectpicker').selectpicker();
            
             $('.selectpicker').selectpicker({
                style: 'btn-info',
                size: 4
            });
            function soloNumeros(e){
                var key = window.Event ? e.which : e.keyCode
                return (key >= 48 && key <= 57)
            }
            
            
    function validacion() {
        
        valor = document.getElementById("txtnombre").value;
        valor2 = document.getElementById("txtapaterno").value;
        valor3 = document.getElementById("txtamaterno").value;
        valor5 = document.getElementById("txtfechan").value;
        valor6 = document.getElementById("comboNacionalidad").selectedIndex;
        valor7 = document.getElementById("txtdni").value;
        valor8 = document.getElementById("comboDepartamento").selectedIndex;
        valor9 = document.getElementById("txtdireccion").value;
        valor10= document.getElementById("comboDistrito").selectedIndex;
        valor11 = document.getElementById("txttfijo").value;
        valor12 = document.getElementById("txttcelular").value;
        valor13 = document.getElementById("txtcontraseña").value;
        valor14 = document.getElementById("txtrcontraseña").value;
        
            
  if ( valor == null || valor.length == 0 || /^\s+$/.test(valor) ) {
   
    alert('Falta Nombre');
      return  false;
   
  }else if ( valor2 == null || valor2.length == 0 || /^\s+$/.test(valor) ) {
   
    alert('Falta Apellido Paterno');
      return  false;
  }else if(valor3 == null || valor3.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta Apellido Materno');
      return  false;
  }else if(document.getElementById('radiohombre').checked==false && document.getElementById('radiomujer').checked==false){
          
     alert('Falta Seleccionar el sexo');
      return  false;
  }else if(valor5 == null || valor5.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta la fecha de nacimiento');
      return  false;
  }else if(valor6==0){
          
      alert('Falta Seleccionar Nacionalidad');
      return  false;
  }else if(valor7 == null || valor7.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta Apellido Dni');
      return  false;
  }else if(valor8==0){
          
      alert('Falta Seleccionar Departamento');
      return  false;
  }else if(valor9 == null || valor9.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta Direccion');
      return  false;
  }else if(valor10==0){
          
      alert('Falta Seleccionar Distrito');
      return  false;
  }else if(valor11 == null || valor11.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta  Telefono Fijo');
      return  false;
  }else if(valor12 == null || valor12.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta  Telefono Celular');
      return  false;
  }else if(valor13 == null || valor13.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta Contraseña');
      return  false;
  }else if(valor14 == null || valor14.length == 0 || /^\s+$/.test(valor)){
          
    alert('Falta Repetir Contraseña');
      return  false;
  }else if(valor13!=valor14){
          
     alert('Contraseñas no coinciden');
      return  false;
  }
  
  
  
}        
    
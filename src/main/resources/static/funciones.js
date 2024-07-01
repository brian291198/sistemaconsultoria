import Swal from 'sweetalert2'

// or via CommonJS
const Swal = require('sweetalert2')

import Swal from 'sweetalert2/dist/sweetalert2.js'
import 'sweetalert2/src/sweetalert2.scss'

function eliminar(id) {

	Swal.fire({
		title: "¿Estás seguro de eliminar?",
		text: "You won't be able to revert this!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	}).then((OK) => {
		if (OK) {

			$.ajax({
				url: "/asesor/eliminar/"+id, 
				success: function(res) {
					console.log(res);
				}
			});
			swal("Te imaginas este archivo eliminado?", {
				title: "Deleted!",
				text: "Your file has been deleted.",
				icon: "success"
			}).then((ok)=>{
				if(ok){
					location.href="/asesor/lista/";
				}
			});
		}else{
			swal("Tu archivo fue salvado!");
		}
	});
}
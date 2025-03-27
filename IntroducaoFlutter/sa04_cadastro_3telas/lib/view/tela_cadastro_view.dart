import 'package:flutter/material.dart';

class TelaCadastro extends StatefulWidget{
  _TelaCadastroState createState() => _TelaCadastroState();
}

class _TelaCadastroState extends State<TelaCadastro>{
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Tela Cadastro"),centerTitle: true,),
      body: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          children: [
            Text("Cadastro"),
            ElevatedButton(
              onPressed: ()=> Navigator.pushNamed(context, "/"), 
              child: Text("Voltar")),
            //Criar a Validação dos Dados do formulários para mudar de tela
            ElevatedButton(
              onPressed: ()=> Navigator.pushNamed(context, "/confirmacao"), 
              child: Text("Enviar"))
          ],
        ),),
    );
  }
}
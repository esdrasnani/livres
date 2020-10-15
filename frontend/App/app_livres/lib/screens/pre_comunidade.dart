import 'package:flutter/material.dart';

class PreComunidade extends StatefulWidget {
  _PreComunidade createState() => _PreComunidade();
}

class _PreComunidade extends State<PreComunidade> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Pré-Comunidade"),
        backgroundColor: Color.fromARGB(255, 41, 171, 226),
        centerTitle: true,
      ),
      body: ListView(
        children: [
          ListTile(
            leading: CircleAvatar(
              child: Icon(Icons.group),
              backgroundColor: Color.fromARGB(255, 41, 171, 226),
              foregroundColor: Colors.white,
            ),
            title: Text('Pre-Comunidade 1'),
            trailing: Container(
              width: 100,
              child: Row(
                children: [
                  IconButton(
                    icon: Icon(Icons.edit),
                    color: Colors.orange,
                    onPressed: () {},
                  ),
                  IconButton(
                    icon: Icon(Icons.delete),
                    color: Colors.red,
                    onPressed: () {},
                  ),
                ],
              ),
            ),
            onTap: () {},
          ),
          ListTile(
            leading: CircleAvatar(
              child: Icon(Icons.group),
              backgroundColor: Color.fromARGB(255, 41, 171, 226),
              foregroundColor: Colors.white,
            ),
            title: Text('Pre-Comunidade 2'),
            trailing: Container(
              width: 100,
              child: Row(
                children: [
                  IconButton(
                    icon: Icon(Icons.edit),
                    color: Colors.orange,
                    onPressed: () {},
                  ),
                  IconButton(
                    icon: Icon(Icons.delete),
                    color: Colors.red,
                    onPressed: () {},
                  ),
                ],
              ),
            ),
            onTap: () {},
          ),
          ListTile(
            leading: CircleAvatar(
              child: Icon(Icons.group),
              backgroundColor: Color.fromARGB(255, 41, 171, 226),
              foregroundColor: Colors.white,
            ),
            title: Text('Pre-Comunidade 3'),
            trailing: Container(
              width: 100,
              child: Row(
                children: [
                  IconButton(
                    icon: Icon(Icons.edit),
                    color: Colors.orange,
                    onPressed: () {},
                  ),
                  IconButton(
                    icon: Icon(Icons.delete),
                    color: Colors.red,
                    onPressed: () {},
                  ),
                ],
              ),
            ),
            onTap: () {},
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: addPrecomunidade,
        child: Icon(Icons.add),
        backgroundColor: Color.fromARGB(255, 41, 171, 226),
      ),
    );
  }

  addPrecomunidade() {
    return showDialog(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.all(Radius.circular(32.0))),
            contentPadding: EdgeInsets.only(top: 10.0),
            content: Container(
              width: 50.0,
              child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                mainAxisSize: MainAxisSize.min,
                children: <Widget>[
                  Padding(
                    padding:
                        EdgeInsets.only(left: 30.0, right: 30.0, top: 30.0),
                    child: TextField(
                      decoration: InputDecoration(
                        hintText: "Nome da Pré-Comunidade",
                        border: InputBorder.none,
                      ),
                      maxLines: 3,
                    ),
                  ),
                  InkWell(
                    child: Container(
                      padding: EdgeInsets.only(top: 20.0, bottom: 20.0),
                      decoration: BoxDecoration(
                        color: Color.fromARGB(255, 41, 171, 226),
                        borderRadius: BorderRadius.only(
                            bottomLeft: Radius.circular(32.0),
                            bottomRight: Radius.circular(32.0)),
                      ),
                      child: Text(
                        "Adicionar",
                        style: TextStyle(color: Colors.white),
                        textAlign: TextAlign.center,
                      ),
                    ),
                  ),
                ],
              ),
            ),
          );
        });
  }
}

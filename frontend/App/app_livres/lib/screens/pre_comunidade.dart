import 'package:flutter/material.dart';

class PreComunidade extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Pré-Comunidade"),
        backgroundColor: Color.fromARGB(255, 41, 171, 226),
        centerTitle: true,
        actions: [
          IconButton(
            icon: Icon(Icons.add),
            color: Colors.white,
            onPressed: () {},
          ),
        ],
      ),
      body: ListView(
        children: [
          ListTile(
            leading: IconButton(
              icon: CircleAvatar(
                child: Icon(Icons.business_center),
              ),
              onPressed: () {},
              iconSize: 20,
            ),
            title: Text('Pre-Comunidade 1'),
            subtitle: Text('Descrição Rápida sobre'),
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
          ),
          ListTile(
            leading: IconButton(
              icon: CircleAvatar(
                child: Icon(Icons.business_center),
              ),
              onPressed: () {},
              iconSize: 20,
            ),
            title: Text('Pre-Comunidade 2'),
            subtitle: Text('Descrição Rápida sobre'),
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
          ),
          ListTile(
            leading: IconButton(
              icon: CircleAvatar(
                child: Icon(Icons.business_center),
              ),
              onPressed: () {},
              iconSize: 20,
            ),
            title: Text('Pre-Comunidade 3'),
            subtitle: Text('Descrição Rápida sobre'),
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
          ),
        ],
      ),
    );
  }
}

# Product Hunt

#Tela das Coleções
Ao abrir o aplicativo, irá carregar uma lista de coleções, a mesma esta paginada e com "scroll-infinite".
Foi implementado a funcionalidade "Swipe-to-Refresh" para atualizar a lista.
A lista de coleções, pode ser ordenadas por seguintes tópicos:
Número de posts
Por título
Por criador 

#Tela dos Posts
Ao clicar em uma colecção, o aplicativo irá para tela de posts. Na tela post o aplicativo irá carregar os post da coleção realizando um verificação abaixo:
Verifica se algum dos posts retornados, tem a data de criação igual a data da pesquisa(dia atual).
Caso não tenha nenhum post com a data igual a data de criação, será exibidos ao usuário os posts mais recentes ou retornados, notificando-o sobre esta ação.
A lista de posts, pode ser ordenadas por seguintes tópicos:
Número de posts
Por título
Por criador 
O usuário terá mais duas opções para filtrar posts:
Ver todos(Não considera a coleção selecionada anteriormente), lista paginada e com scroll-infinite
Por data especifica(Não considera a coleção selecionada anteriormente) lista paginada e com scroll-infinite


#Tela de Detalhe do Post
Ao clicar em um post, o aplicativo irá para tela de detalhes do post. Na tela detalhes do post o aplicativo irá carregar os detalhes do post.
Nesta tela, tem algumas ações disponível para o usuário, segue abaixo:
Botão para ler o detalhe do usuário criador do post
Clicar em cima do usuario que votou no post e ler o detalhe do mesmo.

#Tela de Detalhe do Usuário
Ao clicar em em das ações disponíveis na tela anterior citada acima, o aplicativo irá para tela de detalhes do usuário. Na tela detalhes do usuário o aplicativo irá carregar algumas informações do usuário selecionado, como:
Todos os posts que o usuário publicou. Para navegar entre os posts, utilizei "scroll horizontal" e ao clicar em algum post, será redirecionado para detalhe do post.
Todos os posts que o usuário votou. Para navegar entre os posts, utilizei "scroll horizontal" e ao clicar em algum post, será redirecionado para detalhe do post.

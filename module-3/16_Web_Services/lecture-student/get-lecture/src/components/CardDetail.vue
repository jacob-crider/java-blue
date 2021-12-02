<template>
  <div>
    <h1>{{card.title}}</h1>
    <p>{{card.description}}</p>

    <div class="loading" v-if="">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <commments-list v-else v-bind:comments="card.comments"></commments-list>
  </div>
</template>

<script>
import boardService from '../services/BoardService'
import CommentsList from '../components/CommentsList'

export default {
  name: "card-detail",
  components: {
    CommentsList
  },
  data() {
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      },
      isLoading = true
    }
  },
  created() {
    boardService.getCard(this.$route.params.boardId, this.$route.params.cardId).then( response => {
      this.card = response;
      this.isLoading = false;
    });
    }
};
</script>

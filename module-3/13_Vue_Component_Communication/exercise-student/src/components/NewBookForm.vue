<template>
  <form class="new-book-form">
  <div>
      <label for="title">Title:</label>
    <input type="text" class="title-input" name="title" id="title"/>
  </div>
  <div>
      <label for="author">Author:</label>
      <input type="text" class="author-input" name="author" id="author">
  </div>
  <div>
      <label for="isbn">ISBN:</label>
      <input type="number" class="isbn-input" name="isbn" id="isbn">
  </div>
  <input type="submit">
  </form>
</template>

<script>
export default {
  name: "new-book-form",
};
</script>

<style>
</style>
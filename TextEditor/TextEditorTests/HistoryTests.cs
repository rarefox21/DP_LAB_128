using Xunit;
using TextEditor;

namespace TextEditorTests
{
    public class HistoryTests
    {
        [Fact]
        public void Undo_ShouldRestorePreviousState()
        {
            var editor = new TextEditor.TextEditor();
            var history = new History(editor);

            editor.SetContent("First State");
            history.Backup();

            editor.SetContent("Second State");
            history.Backup();

            history.Undo();
            Assert.Equal("First State", editor.CreateMemento().Content);
        }

        [Fact]
        public void Undo_WithoutHistory_ShouldNotThrowException()
        {
            var editor = new TextEditor.TextEditor();
            var history = new History(editor);

            var exception = Record.Exception(() => history.Undo());

            Assert.Null(exception);
        }
    }
}
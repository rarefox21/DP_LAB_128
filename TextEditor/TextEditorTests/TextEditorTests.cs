using Xunit;
using System;
using TextEditor;

namespace TextEditorTests
{
    public class TextEditorTests
    {
        [Fact]
        public void SetContent_ShouldUpdateContent()
        {
            var editor = new TextEditor.TextEditor();
            editor.SetContent("Hello");
            Assert.Equal("Hello", editor.CreateMemento().Content);
        }

        [Fact]
        public void SetCursorPosition_ValidPosition_ShouldUpdatePosition()
        {
            var editor = new TextEditor.TextEditor();
            editor.SetContent("Hello");
            editor.SetCursorPosition(3);
            Assert.Equal(3, editor.CreateMemento().CursorPosition);
        }

        [Fact]
        public void SetCursorPosition_InvalidPosition_ShouldThrowException()
        {
            var editor = new TextEditor.TextEditor();
            editor.SetContent("Hello");

            Assert.Throws<ArgumentOutOfRangeException>(() => editor.SetCursorPosition(10));
        }
    }
}
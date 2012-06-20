package org.xtext.template.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemplateLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_TEXT_EXP2EXP=7;
    public static final int RULE_TEXT_EXP2STM=5;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_HEX=9;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int RULE_TEXT_STM2EXP=8;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=10;
    public static final int RULE_DECIMAL=11;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=12;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int RULE_TEXT_STM2STM=6;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_IN_STRING=13;
    public static final int T__76=76;
    public static final int RULE_WS=16;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalTemplateLexer() {;} 
    public InternalTemplateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTemplateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:11:7: ( '=' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:12:7: ( '+=' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:12:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:13:7: ( '||' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:13:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:14:7: ( '&&' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:15:7: ( 'endif' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:15:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:16:7: ( '==' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:16:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:17:7: ( '!=' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:17:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18:7: ( '>=' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:19:7: ( '<=' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:19:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:20:7: ( '>' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:21:7: ( '<' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:21:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:22:7: ( '->' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:22:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:23:7: ( '..' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:23:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:24:7: ( '=>' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:24:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:25:7: ( '<>' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:25:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:26:7: ( '?:' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:26:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:27:7: ( '<=>' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:27:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:28:7: ( '+' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:29:7: ( '-' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:30:7: ( '*' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:31:7: ( '**' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:31:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:32:7: ( '/' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:33:7: ( '%' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:34:7: ( '!' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:34:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:35:7: ( '.' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:36:7: ( 'val' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:36:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:37:7: ( 'super' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:37:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:38:7: ( 'false' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:38:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:39:7: ( '<%' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:39:9: '<%'
            {
            match("<%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:40:7: ( 'package' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:40:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:41:7: ( 'import' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:41:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:42:7: ( 'param' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:42:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:43:7: ( 'for' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:43:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:44:7: ( ':' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:44:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:45:7: ( 'endfor' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:45:9: 'endfor'
            {
            match("endfor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:46:7: ( 'if' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:46:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:47:7: ( 'elseif' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:47:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:48:7: ( 'else' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:48:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:49:7: ( '@' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:49:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:50:7: ( '(' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:50:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:51:7: ( ')' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:51:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:52:7: ( ',' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:52:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:53:7: ( '{' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:53:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:54:7: ( '}' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:54:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:55:7: ( 'instanceof' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:55:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:56:7: ( 'as' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:56:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:57:7: ( ']' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:57:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:58:7: ( '[' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:58:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:59:7: ( ';' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:59:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:60:7: ( 'switch' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:60:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:61:7: ( 'default' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:61:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:62:7: ( 'case' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:62:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:63:7: ( 'while' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:63:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:64:7: ( 'do' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:64:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:65:7: ( '::' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:65:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:66:7: ( 'new' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:66:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:67:7: ( 'null' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:67:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:68:7: ( 'typeof' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:68:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:69:7: ( 'throw' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:69:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:70:7: ( 'return' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:70:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:71:7: ( 'try' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:71:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:72:7: ( 'finally' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:72:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:73:7: ( 'catch' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:73:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:74:7: ( '?' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:74:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:75:7: ( 'extends' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:75:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:76:7: ( '&' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:76:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:77:7: ( '?.' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:77:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:78:7: ( '*.' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:78:9: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:79:7: ( '|' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:79:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:80:7: ( 'var' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:80:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:81:7: ( 'true' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:81:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "RULE_TEXT_EXP2EXP"
    public final void mRULE_TEXT_EXP2EXP() throws RecognitionException {
        try {
            int _type = RULE_TEXT_EXP2EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:19: ( '?>' ( RULE_IN_STRING )* ( '<?' | EOF ) )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:21: '?>' ( RULE_IN_STRING )* ( '<?' | EOF )
            {
            match("?>"); 

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:26: ( RULE_IN_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='<') ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>='\u0000' && LA1_1<='$')||(LA1_1>='&' && LA1_1<='>')||(LA1_1>='@' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:26: RULE_IN_STRING
            	    {
            	    mRULE_IN_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:42: ( '<?' | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                alt2=1;
            }
            else {
                alt2=2;}
            switch (alt2) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:43: '<?'
                    {
                    match("<?"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18806:48: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_EXP2EXP"

    // $ANTLR start "RULE_TEXT_EXP2STM"
    public final void mRULE_TEXT_EXP2STM() throws RecognitionException {
        try {
            int _type = RULE_TEXT_EXP2STM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:19: ( '?>' ( RULE_IN_STRING )* ( '<%' | EOF ) )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:21: '?>' ( RULE_IN_STRING )* ( '<%' | EOF )
            {
            match("?>"); 

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:26: ( RULE_IN_STRING )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='<') ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>='\u0000' && LA3_1<='$')||(LA3_1>='&' && LA3_1<='>')||(LA3_1>='@' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=';')||(LA3_0>='=' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:26: RULE_IN_STRING
            	    {
            	    mRULE_IN_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:42: ( '<%' | EOF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='<') ) {
                alt4=1;
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:43: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18808:48: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_EXP2STM"

    // $ANTLR start "RULE_TEXT_STM2STM"
    public final void mRULE_TEXT_STM2STM() throws RecognitionException {
        try {
            int _type = RULE_TEXT_STM2STM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:19: ( '%>' ( RULE_IN_STRING )* ( '<%' | EOF ) )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:21: '%>' ( RULE_IN_STRING )* ( '<%' | EOF )
            {
            match("%>"); 

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:26: ( RULE_IN_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='<') ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>='\u0000' && LA5_1<='$')||(LA5_1>='&' && LA5_1<='>')||(LA5_1>='@' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=';')||(LA5_0>='=' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:26: RULE_IN_STRING
            	    {
            	    mRULE_IN_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:42: ( '<%' | EOF )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='<') ) {
                alt6=1;
            }
            else {
                alt6=2;}
            switch (alt6) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:43: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18810:48: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_STM2STM"

    // $ANTLR start "RULE_TEXT_STM2EXP"
    public final void mRULE_TEXT_STM2EXP() throws RecognitionException {
        try {
            int _type = RULE_TEXT_STM2EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:19: ( '%>' ( RULE_IN_STRING )* ( '<?' | EOF ) )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:21: '%>' ( RULE_IN_STRING )* ( '<?' | EOF )
            {
            match("%>"); 

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:26: ( RULE_IN_STRING )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='<') ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1>='\u0000' && LA7_1<='$')||(LA7_1>='&' && LA7_1<='>')||(LA7_1>='@' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=';')||(LA7_0>='=' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:26: RULE_IN_STRING
            	    {
            	    mRULE_IN_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:42: ( '<?' | EOF )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='<') ) {
                alt8=1;
            }
            else {
                alt8=2;}
            switch (alt8) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:43: '<?'
                    {
                    match("<?"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18812:48: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_STM2EXP"

    // $ANTLR start "RULE_IN_STRING"
    public final void mRULE_IN_STRING() throws RecognitionException {
        try {
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18814:25: ( ( '<' ~ ( ( '%' | '?' ) ) | ~ ( '<' ) ) )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18814:27: ( '<' ~ ( ( '%' | '?' ) ) | ~ ( '<' ) )
            {
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18814:27: ( '<' ~ ( ( '%' | '?' ) ) | ~ ( '<' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='<') ) {
                alt9=1;
            }
            else if ( ((LA9_0>='\u0000' && LA9_0<=';')||(LA9_0>='=' && LA9_0<='\uFFFF')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18814:28: '<' ~ ( ( '%' | '?' ) )
                    {
                    match('<'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='$')||(input.LA(1)>='&' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18814:45: ~ ( '<' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:12: ( '0x' | '0X' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='x') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='X') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='f')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='#') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='B'||LA12_0=='b') ) {
                        alt12=1;
                    }
                    else if ( (LA12_0=='L'||LA12_0=='l') ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18816:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18818:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18818:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18818:21: ( '0' .. '9' | '_' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||LA14_0=='_') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='E'||LA16_0=='e') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:36: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='B'||LA17_0=='b') ) {
                alt17=1;
            }
            else if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='L'||LA17_0=='d'||LA17_0=='f'||LA17_0=='l') ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18820:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18822:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18822:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18822:11: ( '^' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='^') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18822:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18822:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='$'||(LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\'') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18824:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18826:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18826:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18826:24: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='*') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='/') ) {
                        alt23=2;
                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18826:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:40: ( ( '\\r' )? '\\n' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:41: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18828:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18830:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18830:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18830:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18832:16: ( . )
            // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:18832:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | RULE_TEXT_EXP2EXP | RULE_TEXT_EXP2STM | RULE_TEXT_STM2STM | RULE_TEXT_STM2EXP | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=84;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:418: T__86
                {
                mT__86(); 

                }
                break;
            case 70 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:424: T__87
                {
                mT__87(); 

                }
                break;
            case 71 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:430: T__88
                {
                mT__88(); 

                }
                break;
            case 72 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:436: RULE_TEXT_EXP2EXP
                {
                mRULE_TEXT_EXP2EXP(); 

                }
                break;
            case 73 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:454: RULE_TEXT_EXP2STM
                {
                mRULE_TEXT_EXP2STM(); 

                }
                break;
            case 74 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:472: RULE_TEXT_STM2STM
                {
                mRULE_TEXT_STM2STM(); 

                }
                break;
            case 75 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:490: RULE_TEXT_STM2EXP
                {
                mRULE_TEXT_STM2EXP(); 

                }
                break;
            case 76 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:508: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 77 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:517: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 78 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:526: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 79 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:539: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 80 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:547: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 81 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:559: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 82 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:575: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 83 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:591: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 84 :
                // ../org.xtext.template.ui/src-gen/org/xtext/template/ui/contentassist/antlr/internal/InternalTemplate.g:1:599: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\1\uffff\1\57\1\61\1\63\1\65\1\71\1\73\1\75\1\101\1\103\1\105\1"+
        "\111\1\114\1\117\1\121\5\71\1\135\6\uffff\1\71\3\uffff\6\71\2\164"+
        "\1\54\1\uffff\2\54\13\uffff\3\71\5\uffff\1\174\11\uffff\1\177\7"+
        "\uffff\1\u0082\1\uffff\10\71\1\u008d\1\71\10\uffff\1\u008f\3\uffff"+
        "\1\71\1\u0091\10\71\1\uffff\1\164\4\uffff\3\71\3\uffff\1\177\2\uffff"+
        "\1\u0082\1\uffff\1\u00a4\1\u00a5\3\71\1\u00a9\4\71\1\uffff\1\71"+
        "\1\uffff\1\71\1\uffff\3\71\1\u00b3\3\71\1\u00b7\4\71\1\u00bd\1\71"+
        "\1\177\1\uffff\1\u0082\3\uffff\3\71\1\uffff\6\71\1\u00c8\2\71\1"+
        "\uffff\1\u00cb\2\71\1\uffff\1\u00ce\1\71\1\u00d0\2\71\1\uffff\1"+
        "\71\1\u00d4\1\71\1\u00d6\2\71\1\u00d9\3\71\1\uffff\1\u00dd\1\u00de"+
        "\1\uffff\1\71\1\u00e0\1\uffff\1\71\1\uffff\1\u00e2\1\u00e3\1\71"+
        "\1\uffff\1\u00e5\1\uffff\2\71\1\uffff\1\u00e8\2\71\2\uffff\1\u00eb"+
        "\1\uffff\1\u00ec\2\uffff\1\u00ed\1\uffff\1\u00ee\1\u00ef\1\uffff"+
        "\1\71\1\u00f1\5\uffff\1\71\1\uffff\1\71\1\u00f4\1\uffff";
    static final String DFA28_eofS =
        "\u00f5\uffff";
    static final String DFA28_minS =
        "\1\0\2\75\1\174\1\46\1\154\2\75\1\45\1\76\2\56\2\52\1\76\1\141\1"+
        "\165\2\141\1\146\1\72\6\uffff\1\163\3\uffff\1\145\1\141\1\150\1"+
        "\145\1\150\1\145\2\60\1\44\1\uffff\2\0\13\uffff\1\144\1\163\1\164"+
        "\5\uffff\1\76\11\uffff\1\0\7\uffff\1\0\1\uffff\1\154\1\160\1\151"+
        "\1\154\1\162\1\156\1\143\1\160\1\44\1\163\10\uffff\1\44\3\uffff"+
        "\1\146\1\44\1\163\1\151\1\167\1\154\1\160\1\162\1\165\1\164\1\uffff"+
        "\1\60\4\uffff\1\146\2\145\2\uffff\2\0\1\uffff\2\0\1\uffff\2\44\1"+
        "\145\1\164\1\163\1\44\1\141\1\153\1\141\1\157\1\uffff\1\164\1\uffff"+
        "\1\141\1\uffff\1\145\1\143\1\154\1\44\1\154\1\145\1\157\1\44\1\145"+
        "\1\165\1\146\1\157\1\44\1\156\1\0\1\uffff\1\0\3\uffff\1\162\1\143"+
        "\1\145\1\uffff\1\154\1\141\1\155\1\162\1\141\1\165\1\44\1\150\1"+
        "\145\1\uffff\1\44\1\157\1\167\1\uffff\1\44\1\162\1\44\1\162\1\146"+
        "\1\uffff\1\144\1\44\1\150\1\44\1\154\1\147\1\44\1\164\1\156\1\154"+
        "\1\uffff\2\44\1\uffff\1\146\1\44\1\uffff\1\156\1\uffff\2\44\1\163"+
        "\1\uffff\1\44\1\uffff\1\171\1\145\1\uffff\1\44\1\143\1\164\2\uffff"+
        "\1\44\1\uffff\1\44\2\uffff\1\44\1\uffff\2\44\1\uffff\1\145\1\44"+
        "\5\uffff\1\157\1\uffff\1\146\1\44\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\1\170\2\75\2\76\1\56\1\76\1\56\1\57"+
        "\1\76\1\141\1\167\1\157\1\141\1\156\1\72\6\uffff\1\163\3\uffff\1"+
        "\157\1\141\1\150\1\165\1\171\1\145\1\170\1\154\1\172\1\uffff\2\uffff"+
        "\13\uffff\1\144\1\163\1\164\5\uffff\1\76\11\uffff\1\uffff\7\uffff"+
        "\1\uffff\1\uffff\1\162\1\160\1\151\1\154\1\162\1\156\1\162\1\160"+
        "\1\172\1\163\10\uffff\1\172\3\uffff\1\146\1\172\1\164\1\151\1\167"+
        "\1\154\1\160\1\162\1\171\1\164\1\uffff\1\154\4\uffff\1\151\2\145"+
        "\2\uffff\2\uffff\1\uffff\2\uffff\1\uffff\2\172\1\145\1\164\1\163"+
        "\1\172\1\141\1\153\1\141\1\157\1\uffff\1\164\1\uffff\1\141\1\uffff"+
        "\1\145\1\143\1\154\1\172\1\154\1\145\1\157\1\172\1\145\1\165\1\146"+
        "\1\157\1\172\1\156\1\uffff\1\uffff\1\uffff\3\uffff\1\162\1\143\1"+
        "\145\1\uffff\1\154\1\141\1\155\1\162\1\141\1\165\1\172\1\150\1\145"+
        "\1\uffff\1\172\1\157\1\167\1\uffff\1\172\1\162\1\172\1\162\1\146"+
        "\1\uffff\1\144\1\172\1\150\1\172\1\154\1\147\1\172\1\164\1\156\1"+
        "\154\1\uffff\2\172\1\uffff\1\146\1\172\1\uffff\1\156\1\uffff\2\172"+
        "\1\163\1\uffff\1\172\1\uffff\1\171\1\145\1\uffff\1\172\1\143\1\164"+
        "\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\1\145\1\172\5\uffff\1\157\1\uffff\1\146\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\25\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\uffff\1\57\1\60\1\61\11"+
        "\uffff\1\117\2\uffff\1\123\1\124\1\6\1\16\1\1\1\2\1\22\1\3\1\105"+
        "\1\4\1\102\3\uffff\1\117\1\7\1\30\1\10\1\12\1\uffff\1\17\1\35\1"+
        "\13\1\14\1\23\1\15\1\31\1\20\1\103\1\uffff\1\100\1\25\1\104\1\24"+
        "\1\121\1\122\1\26\1\uffff\1\27\12\uffff\1\67\1\42\1\47\1\50\1\51"+
        "\1\52\1\53\1\54\1\uffff\1\57\1\60\1\61\12\uffff\1\114\1\uffff\1"+
        "\115\1\116\1\120\1\123\3\uffff\1\21\1\11\2\uffff\1\110\2\uffff\1"+
        "\112\12\uffff\1\44\1\uffff\1\56\1\uffff\1\66\17\uffff\1\111\1\uffff"+
        "\1\113\1\32\1\106\3\uffff\1\41\11\uffff\1\70\3\uffff\1\75\5\uffff"+
        "\1\46\12\uffff\1\64\2\uffff\1\71\2\uffff\1\107\1\uffff\1\5\3\uffff"+
        "\1\33\1\uffff\1\34\2\uffff\1\40\3\uffff\1\77\1\65\1\uffff\1\73\1"+
        "\uffff\1\43\1\45\1\uffff\1\62\2\uffff\1\37\2\uffff\1\72\1\74\1\101"+
        "\1\76\1\36\1\uffff\1\63\2\uffff\1\55";
    static final String DFA28_specialS =
        "\1\1\50\uffff\1\12\1\0\35\uffff\1\6\7\uffff\1\2\54\uffff\1\11\1"+
        "\10\1\uffff\1\5\1\4\36\uffff\1\7\1\uffff\1\3\122\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\6\1\51\1\54\1\50\1\16\1\4"+
            "\1\52\1\26\1\27\1\14\1\2\1\30\1\11\1\12\1\15\1\45\11\46\1\24"+
            "\1\36\1\10\1\1\1\7\1\13\1\25\32\50\1\35\1\54\1\34\1\47\1\50"+
            "\1\54\1\33\1\50\1\40\1\37\1\5\1\21\2\50\1\23\4\50\1\42\1\50"+
            "\1\22\1\50\1\44\1\20\1\43\1\50\1\17\1\41\3\50\1\31\1\3\1\32"+
            "\uff82\54",
            "\1\55\1\56",
            "\1\60",
            "\1\62",
            "\1\64",
            "\1\67\1\uffff\1\66\11\uffff\1\70",
            "\1\72",
            "\1\74",
            "\1\100\27\uffff\1\76\1\77",
            "\1\102",
            "\1\104",
            "\1\107\13\uffff\1\106\3\uffff\1\110",
            "\1\112\3\uffff\1\113",
            "\1\115\4\uffff\1\116",
            "\1\120",
            "\1\122",
            "\1\123\1\uffff\1\124",
            "\1\125\7\uffff\1\127\5\uffff\1\126",
            "\1\130",
            "\1\132\6\uffff\1\131\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "",
            "",
            "",
            "\1\150\11\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154\17\uffff\1\155",
            "\1\157\11\uffff\1\160\6\uffff\1\156",
            "\1\161",
            "\12\163\10\uffff\1\165\1\uffff\3\165\5\uffff\1\165\13\uffff"+
            "\1\162\6\uffff\1\163\2\uffff\1\165\1\uffff\3\165\5\uffff\1\165"+
            "\13\uffff\1\162",
            "\12\163\10\uffff\1\165\1\uffff\3\165\5\uffff\1\165\22\uffff"+
            "\1\163\2\uffff\1\165\1\uffff\3\165\5\uffff\1\165",
            "\1\71\34\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\0\166",
            "\0\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\74\176\1\175\uffc3\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\74\u0081\1\u0080\uffc3\u0081",
            "",
            "\1\u0083\5\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\16\uffff\1\u008b",
            "\1\u008c",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "",
            "",
            "\1\u0090",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u0092\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u009a\3\uffff\1\u0099",
            "\1\u009b",
            "",
            "\12\163\10\uffff\1\165\1\uffff\3\165\5\uffff\1\165\22\uffff"+
            "\1\163\2\uffff\1\165\1\uffff\3\165\5\uffff\1\165",
            "",
            "",
            "",
            "",
            "\1\u009d\2\uffff\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\45\u00a0\1\u00a1\31\u00a0\1\177\uffc0\u00a0",
            "\74\176\1\175\uffc3\176",
            "",
            "\45\u00a2\1\u0082\31\u00a2\1\u00a3\uffc0\u00a2",
            "\74\u0081\1\u0080\uffc3\u0081",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\10"+
            "\71\1\u00bc\21\71",
            "\1\u00be",
            "\74\176\1\175\uffc3\176",
            "",
            "\74\u0081\1\u0080\uffc3\u0081",
            "",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00cf",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00d5",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00d7",
            "\1\u00d8",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "\1\u00df",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "\1\u00e1",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00e4",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "\1\u00f0",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32"+
            "\71",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | RULE_TEXT_EXP2EXP | RULE_TEXT_EXP2STM | RULE_TEXT_STM2STM | RULE_TEXT_STM2EXP | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_42 = input.LA(1);

                        s = -1;
                        if ( ((LA28_42>='\u0000' && LA28_42<='\uFFFF')) ) {s = 118;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='=') ) {s = 1;}

                        else if ( (LA28_0=='+') ) {s = 2;}

                        else if ( (LA28_0=='|') ) {s = 3;}

                        else if ( (LA28_0=='&') ) {s = 4;}

                        else if ( (LA28_0=='e') ) {s = 5;}

                        else if ( (LA28_0=='!') ) {s = 6;}

                        else if ( (LA28_0=='>') ) {s = 7;}

                        else if ( (LA28_0=='<') ) {s = 8;}

                        else if ( (LA28_0=='-') ) {s = 9;}

                        else if ( (LA28_0=='.') ) {s = 10;}

                        else if ( (LA28_0=='?') ) {s = 11;}

                        else if ( (LA28_0=='*') ) {s = 12;}

                        else if ( (LA28_0=='/') ) {s = 13;}

                        else if ( (LA28_0=='%') ) {s = 14;}

                        else if ( (LA28_0=='v') ) {s = 15;}

                        else if ( (LA28_0=='s') ) {s = 16;}

                        else if ( (LA28_0=='f') ) {s = 17;}

                        else if ( (LA28_0=='p') ) {s = 18;}

                        else if ( (LA28_0=='i') ) {s = 19;}

                        else if ( (LA28_0==':') ) {s = 20;}

                        else if ( (LA28_0=='@') ) {s = 21;}

                        else if ( (LA28_0=='(') ) {s = 22;}

                        else if ( (LA28_0==')') ) {s = 23;}

                        else if ( (LA28_0==',') ) {s = 24;}

                        else if ( (LA28_0=='{') ) {s = 25;}

                        else if ( (LA28_0=='}') ) {s = 26;}

                        else if ( (LA28_0=='a') ) {s = 27;}

                        else if ( (LA28_0==']') ) {s = 28;}

                        else if ( (LA28_0=='[') ) {s = 29;}

                        else if ( (LA28_0==';') ) {s = 30;}

                        else if ( (LA28_0=='d') ) {s = 31;}

                        else if ( (LA28_0=='c') ) {s = 32;}

                        else if ( (LA28_0=='w') ) {s = 33;}

                        else if ( (LA28_0=='n') ) {s = 34;}

                        else if ( (LA28_0=='t') ) {s = 35;}

                        else if ( (LA28_0=='r') ) {s = 36;}

                        else if ( (LA28_0=='0') ) {s = 37;}

                        else if ( ((LA28_0>='1' && LA28_0<='9')) ) {s = 38;}

                        else if ( (LA28_0=='^') ) {s = 39;}

                        else if ( (LA28_0=='$'||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='b'||(LA28_0>='g' && LA28_0<='h')||(LA28_0>='j' && LA28_0<='m')||LA28_0=='o'||LA28_0=='q'||LA28_0=='u'||(LA28_0>='x' && LA28_0<='z')) ) {s = 40;}

                        else if ( (LA28_0=='\"') ) {s = 41;}

                        else if ( (LA28_0=='\'') ) {s = 42;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 43;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='#'||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='~' && LA28_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_80 = input.LA(1);

                        s = -1;
                        if ( (LA28_80=='<') ) {s = 128;}

                        else if ( ((LA28_80>='\u0000' && LA28_80<=';')||(LA28_80>='=' && LA28_80<='\uFFFF')) ) {s = 129;}

                        else s = 130;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_162 = input.LA(1);

                        s = -1;
                        if ( (LA28_162=='<') ) {s = 128;}

                        else if ( ((LA28_162>='\u0000' && LA28_162<=';')||(LA28_162>='=' && LA28_162<='\uFFFF')) ) {s = 129;}

                        else s = 130;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_129 = input.LA(1);

                        s = -1;
                        if ( (LA28_129=='<') ) {s = 128;}

                        else if ( ((LA28_129>='\u0000' && LA28_129<=';')||(LA28_129>='=' && LA28_129<='\uFFFF')) ) {s = 129;}

                        else s = 130;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_128 = input.LA(1);

                        s = -1;
                        if ( ((LA28_128>='\u0000' && LA28_128<='$')||(LA28_128>='&' && LA28_128<='>')||(LA28_128>='@' && LA28_128<='\uFFFF')) ) {s = 162;}

                        else if ( (LA28_128=='?') ) {s = 163;}

                        else if ( (LA28_128=='%') ) {s = 130;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_72 = input.LA(1);

                        s = -1;
                        if ( (LA28_72=='<') ) {s = 125;}

                        else if ( ((LA28_72>='\u0000' && LA28_72<=';')||(LA28_72>='=' && LA28_72<='\uFFFF')) ) {s = 126;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_160 = input.LA(1);

                        s = -1;
                        if ( (LA28_160=='<') ) {s = 125;}

                        else if ( ((LA28_160>='\u0000' && LA28_160<=';')||(LA28_160>='=' && LA28_160<='\uFFFF')) ) {s = 126;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_126 = input.LA(1);

                        s = -1;
                        if ( (LA28_126=='<') ) {s = 125;}

                        else if ( ((LA28_126>='\u0000' && LA28_126<=';')||(LA28_126>='=' && LA28_126<='\uFFFF')) ) {s = 126;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_125 = input.LA(1);

                        s = -1;
                        if ( ((LA28_125>='\u0000' && LA28_125<='$')||(LA28_125>='&' && LA28_125<='>')||(LA28_125>='@' && LA28_125<='\uFFFF')) ) {s = 160;}

                        else if ( (LA28_125=='?') ) {s = 127;}

                        else if ( (LA28_125=='%') ) {s = 161;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA28_41 = input.LA(1);

                        s = -1;
                        if ( ((LA28_41>='\u0000' && LA28_41<='\uFFFF')) ) {s = 118;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
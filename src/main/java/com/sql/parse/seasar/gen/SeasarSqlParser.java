// Generated from /Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/g4/SeasarSql.g4 by ANTLR 4.13.1

package com.sql.parse.seasar.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SeasarSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SEASAR_PLACEHOLDER=7, 
		SELECT=8, FROM=9, LEFT=10, INNER=11, JOIN=12, ON=13, NVL=14, DUAL=15, 
		ORDER=16, WHERE=17, BY=18, BETWEEN=19, AND=20, NULL=21, ASC=22, DESC=23, 
		TIMESTAMP=24, DATE=25, LT=26, GT=27, SEMI=28, NUMBER=29, STRING=30, WS=31, 
		COMMENT=32, LINE_COMMENT=33, IF_CONDITION=34, END_CONDITION=35, IDENTIFIER=36;
	public static final int
		RULE_query = 0, RULE_selectClause = 1, RULE_selectItem = 2, RULE_column = 3, 
		RULE_fromClause = 4, RULE_tableSource = 5, RULE_alias = 6, RULE_joinClause = 7, 
		RULE_conditionalJoin = 8, RULE_seasarConditional = 9, RULE_whereClause = 10, 
		RULE_orderByClause = 11, RULE_orderItemList = 12, RULE_orderItem = 13, 
		RULE_orderDirection = 14, RULE_seasarEnd = 15, RULE_subQuery = 16, RULE_functionCall = 17, 
		RULE_nvlCall = 18, RULE_nvlExpr = 19, RULE_placeholder = 20, RULE_conditionalStatement = 21, 
		RULE_condition = 22, RULE_codeBlock = 23, RULE_anyStatement = 24, RULE_functionName = 25, 
		RULE_ifNotNullExpr = 26, RULE_ifNullExpr = 27, RULE_expression = 28, RULE_timestamp = 29, 
		RULE_date = 30, RULE_stringLiteral = 31, RULE_conditionalExpr = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectClause", "selectItem", "column", "fromClause", "tableSource", 
			"alias", "joinClause", "conditionalJoin", "seasarConditional", "whereClause", 
			"orderByClause", "orderItemList", "orderItem", "orderDirection", "seasarEnd", 
			"subQuery", "functionCall", "nvlCall", "nvlExpr", "placeholder", "conditionalStatement", 
			"condition", "codeBlock", "anyStatement", "functionName", "ifNotNullExpr", 
			"ifNullExpr", "expression", "timestamp", "date", "stringLiteral", "conditionalExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'.'", "'/*IF'", "'*/'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'<'", "'>'", "';'", null, null, null, null, 
			null, null, "'/*END*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SEASAR_PLACEHOLDER", "SELECT", 
			"FROM", "LEFT", "INNER", "JOIN", "ON", "NVL", "DUAL", "ORDER", "WHERE", 
			"BY", "BETWEEN", "AND", "NULL", "ASC", "DESC", "TIMESTAMP", "DATE", "LT", 
			"GT", "SEMI", "NUMBER", "STRING", "WS", "COMMENT", "LINE_COMMENT", "IF_CONDITION", 
			"END_CONDITION", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SeasarSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SeasarSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			selectClause();
			setState(67);
			fromClause();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(68);
				whereClause();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(71);
				orderByClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SeasarSqlParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(SELECT);
			setState(75);
			selectItem();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(76);
				match(T__0);
				setState(77);
				selectItem();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConditionalExprContext conditionalExpr() {
			return getRuleContext(ConditionalExprContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SelectItemContext selectItem() {
			return getRuleContext(SelectItemContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectItem);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				conditionalExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__1);
				setState(88);
				selectItem();
				setState(89);
				match(T__2);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(90);
					alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SeasarSqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SeasarSqlParser.IDENTIFIER, i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(96);
				match(T__3);
				setState(97);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SeasarSqlParser.FROM, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public List<ConditionalJoinContext> conditionalJoin() {
			return getRuleContexts(ConditionalJoinContext.class);
		}
		public ConditionalJoinContext conditionalJoin(int i) {
			return getRuleContext(ConditionalJoinContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FROM);
			setState(101);
			tableSource();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3104L) != 0)) {
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT:
				case INNER:
					{
					setState(102);
					joinClause();
					}
					break;
				case T__4:
					{
					setState(103);
					conditionalJoin();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableSourceContext extends ParserRuleContext {
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SeasarSqlParser.IDENTIFIER, 0); }
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterTableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitTableSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitTableSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableSource);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__1);
				setState(110);
				subQuery();
				setState(111);
				match(T__2);
				setState(112);
				alias();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				subQuery();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SeasarSqlParser.IDENTIFIER, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(SeasarSqlParser.LEFT, 0); }
		public TerminalNode JOIN() { return getToken(SeasarSqlParser.JOIN, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public TerminalNode ON() { return getToken(SeasarSqlParser.ON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SeasarSqlParser.INNER, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinClause);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(LEFT);
				setState(121);
				match(JOIN);
				setState(122);
				tableSource();
				setState(123);
				match(ON);
				setState(124);
				condition();
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(INNER);
				setState(127);
				match(JOIN);
				setState(128);
				tableSource();
				setState(129);
				match(ON);
				setState(130);
				condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalJoinContext extends ParserRuleContext {
		public SeasarConditionalContext seasarConditional() {
			return getRuleContext(SeasarConditionalContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public SeasarEndContext seasarEnd() {
			return getRuleContext(SeasarEndContext.class,0);
		}
		public ConditionalJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterConditionalJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitConditionalJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitConditionalJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalJoinContext conditionalJoin() throws RecognitionException {
		ConditionalJoinContext _localctx = new ConditionalJoinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			seasarConditional();
			setState(135);
			joinClause();
			setState(136);
			seasarEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeasarConditionalContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SeasarConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seasarConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterSeasarConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitSeasarConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitSeasarConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeasarConditionalContext seasarConditional() throws RecognitionException {
		SeasarConditionalContext _localctx = new SeasarConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_seasarConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__4);
			setState(139);
			condition();
			setState(140);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SeasarSqlParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHERE);
			setState(143);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SeasarSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SeasarSqlParser.BY, 0); }
		public OrderItemListContext orderItemList() {
			return getRuleContext(OrderItemListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ORDER);
			setState(146);
			match(BY);
			setState(147);
			orderItemList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderItemListContext extends ParserRuleContext {
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public OrderItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterOrderItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitOrderItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitOrderItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemListContext orderItemList() throws RecognitionException {
		OrderItemListContext _localctx = new OrderItemListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			orderItem();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(150);
				match(T__0);
				setState(151);
				orderItem();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderItemContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public OrderDirectionContext orderDirection() {
			return getRuleContext(OrderDirectionContext.class,0);
		}
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterOrderItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitOrderItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitOrderItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderItem);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				stringLiteral();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(161);
					orderDirection();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderDirectionContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SeasarSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SeasarSqlParser.DESC, 0); }
		public OrderDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterOrderDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitOrderDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitOrderDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderDirectionContext orderDirection() throws RecognitionException {
		OrderDirectionContext _localctx = new OrderDirectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orderDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeasarEndContext extends ParserRuleContext {
		public TerminalNode END_CONDITION() { return getToken(SeasarSqlParser.END_CONDITION, 0); }
		public SeasarEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seasarEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterSeasarEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitSeasarEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitSeasarEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeasarEndContext seasarEnd() throws RecognitionException {
		SeasarEndContext _localctx = new SeasarEndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_seasarEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(END_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SeasarSqlParser.SELECT, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SeasarSqlParser.FROM, 0); }
		public TerminalNode DUAL() { return getToken(SeasarSqlParser.DUAL, 0); }
		public SubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryContext subQuery() throws RecognitionException {
		SubQueryContext _localctx = new SubQueryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(SELECT);
			setState(171);
			column();
			setState(172);
			match(FROM);
			setState(173);
			match(DUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			functionName();
			setState(176);
			match(T__1);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70380437508L) != 0)) {
				{
				setState(177);
				expression();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(178);
					match(T__0);
					setState(179);
					expression();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NvlCallContext extends ParserRuleContext {
		public TerminalNode NVL() { return getToken(SeasarSqlParser.NVL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NvlCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nvlCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterNvlCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitNvlCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitNvlCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NvlCallContext nvlCall() throws RecognitionException {
		NvlCallContext _localctx = new NvlCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nvlCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NVL);
			setState(190);
			match(T__1);
			setState(191);
			expression();
			setState(192);
			match(T__0);
			setState(193);
			expression();
			setState(194);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NvlExprContext extends ParserRuleContext {
		public TerminalNode NVL() { return getToken(SeasarSqlParser.NVL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NvlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nvlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterNvlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitNvlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitNvlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NvlExprContext nvlExpr() throws RecognitionException {
		NvlExprContext _localctx = new NvlExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nvlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(NVL);
			setState(197);
			match(T__1);
			setState(198);
			expression();
			setState(199);
			match(T__0);
			setState(200);
			expression();
			setState(201);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlaceholderContext extends ParserRuleContext {
		public TerminalNode SEASAR_PLACEHOLDER() { return getToken(SeasarSqlParser.SEASAR_PLACEHOLDER, 0); }
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitPlaceholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_placeholder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SEASAR_PLACEHOLDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectItemContext selectItem() {
			return getRuleContext(SelectItemContext.class,0);
		}
		public TerminalNode END_CONDITION() { return getToken(SeasarSqlParser.END_CONDITION, 0); }
		public TerminalNode IF_CONDITION() { return getToken(SeasarSqlParser.IF_CONDITION, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalStatement);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__4);
				setState(206);
				condition();
				setState(207);
				match(T__5);
				setState(208);
				selectItem();
				setState(209);
				match(END_CONDITION);
				}
				break;
			case IF_CONDITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(IF_CONDITION);
				setState(212);
				codeBlock();
				setState(213);
				match(END_CONDITION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockContext extends ParserRuleContext {
		public List<AnyStatementContext> anyStatement() {
			return getRuleContexts(AnyStatementContext.class);
		}
		public AnyStatementContext anyStatement(int i) {
			return getRuleContext(AnyStatementContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				anyStatement();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 69793218596L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyStatementContext extends ParserRuleContext {
		public SelectItemContext selectItem() {
			return getRuleContext(SelectItemContext.class,0);
		}
		public AnyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterAnyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitAnyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitAnyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyStatementContext anyStatement() throws RecognitionException {
		AnyStatementContext _localctx = new AnyStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_anyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			selectItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SeasarSqlParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfNotNullExprContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public IfNotNullExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotNullExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterIfNotNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitIfNotNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitIfNotNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotNullExprContext ifNotNullExpr() throws RecognitionException {
		IfNotNullExprContext _localctx = new IfNotNullExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifNotNullExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfNullExprContext extends ParserRuleContext {
		public NvlExprContext nvlExpr() {
			return getRuleContext(NvlExprContext.class,0);
		}
		public IfNullExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNullExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterIfNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitIfNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitIfNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNullExprContext ifNullExpr() throws RecognitionException {
		IfNullExprContext _localctx = new IfNullExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifNullExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			nvlExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NvlExprContext nvlExpr() {
			return getRuleContext(NvlExprContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SeasarSqlParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SeasarSqlParser.NUMBER, 0); }
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				nvlExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				column();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				timestamp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				stringLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				match(T__1);
				setState(240);
				expression();
				setState(241);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(243);
				date();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimestampContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(SeasarSqlParser.TIMESTAMP, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TIMESTAMP);
			setState(247);
			match(T__1);
			setState(248);
			stringLiteral();
			setState(249);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SeasarSqlParser.DATE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(DATE);
			setState(252);
			match(T__1);
			setState(253);
			stringLiteral();
			setState(254);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SeasarSqlParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExprContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectItemContext selectItem() {
			return getRuleContext(SelectItemContext.class,0);
		}
		public TerminalNode END_CONDITION() { return getToken(SeasarSqlParser.END_CONDITION, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConditionalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeasarSqlListener ) ((SeasarSqlListener)listener).exitConditionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeasarSqlVisitor ) return ((SeasarSqlVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExprContext conditionalExpr() throws RecognitionException {
		ConditionalExprContext _localctx = new ConditionalExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionalExpr);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__4);
				setState(259);
				condition();
				setState(260);
				match(T__5);
				setState(261);
				selectItem();
				setState(262);
				match(END_CONDITION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__4);
				setState(265);
				condition();
				setState(266);
				match(T__5);
				setState(267);
				functionCall();
				setState(268);
				match(END_CONDITION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000F\b\u0000\u0001\u0000\u0003\u0000I\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0003\u0002^\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004i\b\u0004\n\u0004\f\u0004"+
		"l\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0085\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0099\b\f\n\f\f\f\u009c"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a3\b\r\u0003\r"+
		"\u00a5\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b5\b\u0011\n\u0011"+
		"\f\u0011\u00b8\t\u0011\u0003\u0011\u00ba\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d8\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0004\u0017\u00dd\b\u0017\u000b\u0017\f\u0017\u00de\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u00f5\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u010f"+
		"\b \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0001\u0001"+
		"\u0000\u0016\u0017\u010f\u0000B\u0001\u0000\u0000\u0000\u0002J\u0001\u0000"+
		"\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000"+
		"\bd\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\fv\u0001\u0000"+
		"\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000"+
		"\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u008e\u0001\u0000"+
		"\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0095\u0001\u0000"+
		"\u0000\u0000\u001a\u00a4\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000"+
		"\u0000\u0000\u001e\u00a8\u0001\u0000\u0000\u0000 \u00aa\u0001\u0000\u0000"+
		"\u0000\"\u00af\u0001\u0000\u0000\u0000$\u00bd\u0001\u0000\u0000\u0000"+
		"&\u00c4\u0001\u0000\u0000\u0000(\u00cb\u0001\u0000\u0000\u0000*\u00d7"+
		"\u0001\u0000\u0000\u0000,\u00d9\u0001\u0000\u0000\u0000.\u00dc\u0001\u0000"+
		"\u0000\u00000\u00e0\u0001\u0000\u0000\u00002\u00e2\u0001\u0000\u0000\u0000"+
		"4\u00e4\u0001\u0000\u0000\u00006\u00e6\u0001\u0000\u0000\u00008\u00f4"+
		"\u0001\u0000\u0000\u0000:\u00f6\u0001\u0000\u0000\u0000<\u00fb\u0001\u0000"+
		"\u0000\u0000>\u0100\u0001\u0000\u0000\u0000@\u010e\u0001\u0000\u0000\u0000"+
		"BC\u0003\u0002\u0001\u0000CE\u0003\b\u0004\u0000DF\u0003\u0014\n\u0000"+
		"ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GI\u0003\u0016\u000b\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000I\u0001\u0001\u0000\u0000\u0000JK\u0005\b\u0000\u0000KP\u0003"+
		"\u0004\u0002\u0000LM\u0005\u0001\u0000\u0000MO\u0003\u0004\u0002\u0000"+
		"NL\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u0003\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000S^\u0003\u0006\u0003\u0000T^\u0003\"\u0011\u0000U^\u0003"+
		"@ \u0000V^\u0003>\u001f\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0004"+
		"\u0002\u0000Y[\u0005\u0003\u0000\u0000Z\\\u0003\f\u0006\u0000[Z\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"]S\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000"+
		"\u0000]V\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000^\u0005\u0001"+
		"\u0000\u0000\u0000_b\u0005$\u0000\u0000`a\u0005\u0004\u0000\u0000ac\u0005"+
		"$\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0007"+
		"\u0001\u0000\u0000\u0000de\u0005\t\u0000\u0000ej\u0003\n\u0005\u0000f"+
		"i\u0003\u000e\u0007\u0000gi\u0003\u0010\b\u0000hf\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\t\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0002\u0000\u0000no\u0003 \u0010\u0000op\u0005\u0003"+
		"\u0000\u0000pq\u0003\f\u0006\u0000qu\u0001\u0000\u0000\u0000ru\u0003 "+
		"\u0010\u0000su\u0005$\u0000\u0000tm\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000\u0000"+
		"vw\u0005$\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\n\u0000\u0000"+
		"yz\u0005\f\u0000\u0000z{\u0003\n\u0005\u0000{|\u0005\r\u0000\u0000|}\u0003"+
		",\u0016\u0000}\u0085\u0001\u0000\u0000\u0000~\u007f\u0005\u000b\u0000"+
		"\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003\n\u0005\u0000"+
		"\u0081\u0082\u0005\r\u0000\u0000\u0082\u0083\u0003,\u0016\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084x\u0001\u0000\u0000\u0000\u0084~\u0001"+
		"\u0000\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"\u0012\t\u0000\u0087\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0003\u001e"+
		"\u000f\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0005"+
		"\u0000\u0000\u008b\u008c\u0003,\u0016\u0000\u008c\u008d\u0005\u0006\u0000"+
		"\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0011\u0000"+
		"\u0000\u008f\u0090\u0003,\u0016\u0000\u0090\u0015\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005\u0010\u0000\u0000\u0092\u0093\u0005\u0012\u0000\u0000"+
		"\u0093\u0094\u0003\u0018\f\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095"+
		"\u009a\u0003\u001a\r\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0099"+
		"\u0003\u001a\r\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u00a5\u0003\u0006\u0003\u0000\u009e\u00a5\u0003"+
		"8\u001c\u0000\u009f\u00a5\u0003\"\u0011\u0000\u00a0\u00a2\u0003>\u001f"+
		"\u0000\u00a1\u00a3\u0003\u001c\u000e\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000"+
		"\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a5\u001b\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0000\u0000"+
		"\u0000\u00a7\u001d\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005#\u0000\u0000"+
		"\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab"+
		"\u00ac\u0003\u0006\u0003\u0000\u00ac\u00ad\u0005\t\u0000\u0000\u00ad\u00ae"+
		"\u0005\u000f\u0000\u0000\u00ae!\u0001\u0000\u0000\u0000\u00af\u00b0\u0003"+
		"2\u0019\u0000\u00b0\u00b9\u0005\u0002\u0000\u0000\u00b1\u00b6\u00038\u001c"+
		"\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b5\u00038\u001c\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b1\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000"+
		"\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be"+
		"\u00bf\u0005\u0002\u0000\u0000\u00bf\u00c0\u00038\u001c\u0000\u00c0\u00c1"+
		"\u0005\u0001\u0000\u0000\u00c1\u00c2\u00038\u001c\u0000\u00c2\u00c3\u0005"+
		"\u0003\u0000\u0000\u00c3%\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u000e"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c7\u00038\u001c"+
		"\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00c9\u00038\u001c\u0000"+
		"\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca\'\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0007\u0000\u0000\u00cc)\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0005\u0000\u0000\u00ce\u00cf\u0003,\u0016\u0000\u00cf\u00d0\u0005"+
		"\u0006\u0000\u0000\u00d0\u00d1\u0003\u0004\u0002\u0000\u00d1\u00d2\u0005"+
		"#\u0000\u0000\u00d2\u00d8\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\""+
		"\u0000\u0000\u00d4\u00d5\u0003.\u0017\u0000\u00d5\u00d6\u0005#\u0000\u0000"+
		"\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d8+\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u00038\u001c\u0000\u00da-\u0001\u0000\u0000\u0000\u00db\u00dd\u0003"+
		"0\u0018\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df/\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u0004\u0002"+
		"\u0000\u00e11\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005$\u0000\u0000\u00e3"+
		"3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0006\u0003\u0000\u00e55\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0003&\u0013\u0000\u00e77\u0001\u0000\u0000"+
		"\u0000\u00e8\u00f5\u0003&\u0013\u0000\u00e9\u00f5\u0003\u0006\u0003\u0000"+
		"\u00ea\u00f5\u0005\u001e\u0000\u0000\u00eb\u00f5\u0005\u001d\u0000\u0000"+
		"\u00ec\u00f5\u0003:\u001d\u0000\u00ed\u00f5\u0003\"\u0011\u0000\u00ee"+
		"\u00f5\u0003>\u001f\u0000\u00ef\u00f0\u0005\u0002\u0000\u0000\u00f0\u00f1"+
		"\u00038\u001c\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0003<\u001e\u0000\u00f4\u00e8\u0001\u0000"+
		"\u0000\u0000\u00f4\u00e9\u0001\u0000\u0000\u0000\u00f4\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f4\u00ed\u0001\u0000\u0000\u0000\u00f4\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f59\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0018\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8\u00f9\u0003>\u001f\u0000"+
		"\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa;\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0019\u0000\u0000\u00fc\u00fd\u0005\u0002\u0000\u0000\u00fd"+
		"\u00fe\u0003>\u001f\u0000\u00fe\u00ff\u0005\u0003\u0000\u0000\u00ff=\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005\u001e\u0000\u0000\u0101?\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005\u0005\u0000\u0000\u0103\u0104\u0003,\u0016"+
		"\u0000\u0104\u0105\u0005\u0006\u0000\u0000\u0105\u0106\u0003\u0004\u0002"+
		"\u0000\u0106\u0107\u0005#\u0000\u0000\u0107\u010f\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005\u0005\u0000\u0000\u0109\u010a\u0003,\u0016\u0000\u010a"+
		"\u010b\u0005\u0006\u0000\u0000\u010b\u010c\u0003\"\u0011\u0000\u010c\u010d"+
		"\u0005#\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0102\u0001"+
		"\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010fA\u0001\u0000"+
		"\u0000\u0000\u0013EHP[]bhjt\u0084\u009a\u00a2\u00a4\u00b6\u00b9\u00d7"+
		"\u00de\u00f4\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}